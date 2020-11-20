package br.com.unip.cc.APS.DAO;

import br.com.unip.cc.APS.Connection.ConnectionFactory;
import br.com.unip.cc.APS.Forms.FrmCadUser;
import br.com.unip.cc.APS.Forms.FrmChat;
//import br.com.unip.cc.APSREDES.Forms.FrmConsCorreio;
import br.com.unip.cc.APS.Forms.FrmConsUser;
import br.com.unip.cc.APS.Forms.FrmConsUserAdmin;
import br.com.unip.cc.APS.Forms.FrmSobre;
import br.com.unip.cc.APS.Models.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UsersDAO {
    
    private Connection connection;
    
    public UsersDAO () {
        this.connection = new ConnectionFactory().getConnection();        
    }
        
    public void Logar(Users user, JFrame frame, FrmSobre fs, FrmCadUser fcu, FrmChat fc) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM Users WHERE User LIKE ? AND Senha LIKE ?");            
            stmt.setString(1, user.getUser());
            stmt.setString(2, user.getSenha());            
            ResultSet rs = stmt.executeQuery();            
                    if (rs.next()) {                        
                        user.setId_User(rs.getInt("Id_User"));                        
                        JOptionPane.showMessageDialog(null, "Bem-Vindo(a) ao Chat, "+user.getUser()+"!");
                        fc.id = user.getId_User();
                        frame.dispose();
                        fcu.dispose();
                        fs.dispose();
                        fc.show();                        
                    } else{
                    JOptionPane.showMessageDialog(null, "Usuário e/ou Senha Inválidos!");
                    }                                       
                    rs.close();
                    stmt.close();                    
         } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void Login(Users user, FrmChat fc) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM Users WHERE Id_User = "+fc.id);
                        
            ResultSet rs = stmt.executeQuery();
            
                    while (rs.next()){
                        
                        user.setId_User(rs.getInt("Id_User"));
                        user.setNome(rs.getString("Nome"));
                        user.setEmail(rs.getString("Email"));
                        user.setUser(rs.getString("User"));
                        user.setSenha(rs.getString("Senha"));
                        
                    }
                    
                    rs.close();
                    stmt.close();
                    
         } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void Login(Users user, FrmConsUser fcu) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM Users WHERE Id_User = "+fcu.id);
                        
            ResultSet rs = stmt.executeQuery();
            
                    while (rs.next()){
                        
                        user.setId_User(rs.getInt("Id_User"));
                        user.setNome(rs.getString("Nome"));
                        user.setEmail(rs.getString("Email"));
                        user.setUser(rs.getString("User"));
                        user.setSenha(rs.getString("Senha"));
                        
                    }
                    
                    rs.close();
                    stmt.close();
                    
         } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void VerificarEmailIgual(Users user, JFrame frame, FrmCadUser fcu) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM Users WHERE Email LIKE ?");
            
            stmt.setString(1, user.getEmail());
            
            ResultSet rs = stmt.executeQuery();
            
                   if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Este email já consta no sistema!\nCaso não tenha efetuado o cadastro,\nou tenha esquecido seu nome de Usuário e/ou Senha,\nconverse com o administrador do sistema na sua filial\nou mande-nos um email: chatiete@help.com\ne ficaremos felizes em ajudá-lo(a)!");
                        fcu.EmailIgual();
                    }else{
                        UsersDAO userDAO = new UsersDAO();
                        userDAO.VerificarUsuarioIgual(user, frame, fcu);
                    }
                   
                    rs.close();
                    stmt.close();
                    
         } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void VerificarUsuarioIgual(Users user, JFrame frame, FrmCadUser fcu) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM Users WHERE User LIKE ?");
            
            stmt.setString(1, user.getUser());
            
            ResultSet rs = stmt.executeQuery();
            
                   if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Este nome de usuário já está em uso!\nPor favor, escolha outro!");
                        fcu.UsuarioIgual();
                    }else{
                        UsersDAO userDAO = new UsersDAO();
                        userDAO.CadastrarUsers(user);
                        JOptionPane.showMessageDialog(null, "Cadastro Efetuado Com Sucesso!");
                        fcu.LimparTudo();
                    }
                   
                    rs.close();
                    stmt.close();
                    
         } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void CadastrarUsers(Users user) {
        String sql = "INSERT INTO Users (Nome, Email, User, Senha) VALUES (?, ?, ?, ?)";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getUser());
            stmt.setString(4, user.getSenha());            

            stmt.execute();
            stmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }
    
    public List<Users> getListarTodos(){
        try{
            List<Users> users = new ArrayList<Users>();
            
            PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM Users ORDER BY Nome ASC");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                Users user = new Users();
                user.setId_User(rs.getInt("Id_User"));
                user.setNome(rs.getString("Nome"));
                user.setEmail(rs.getString("Email"));
                user.setUser(rs.getString("User"));
                user.setSenha(rs.getString("Senha"));
                
                users.add(user);
            }
            
            rs.close();
            stmt.close();
            return users;
            
           } catch (SQLException e){
               throw new RuntimeException(e);
           }
    }
    
    public List<Users> getListarNomes(Users us){
        try{
            List<Users> user = new ArrayList<Users>();
            
            PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM Users WHERE Id_User != "+us.getId_User()+" ORDER BY Nome ASC");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                Users users = new Users();
                users.setId_User(rs.getInt("Id_User"));
                users.setNome(rs.getString("Nome"));
                users.setEmail(rs.getString("Email"));
                users.setUser(rs.getString("User"));
                users.setSenha(rs.getString("Senha"));
                
                user.add(users);
            }
            
            rs.close();
            stmt.close();
            return user;
            
           } catch (SQLException e){
               throw new RuntimeException(e);
           }
    }
    
    public void PesquisarID(Users user){
        try{
            PreparedStatement stmt = this.connection.prepareStatement("SELECT Id_User FROM Users WHERE Nome LIKE '%"+user.getNome()+"%'");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                user.setId_User(rs.getInt("Id_User"));
            }
            
            rs.close();
            stmt.close();
            
        } catch (SQLException e){
            throw new RuntimeException (e);
        }
    }
    
    public void PesquisarNome(Users user){
        try{
            PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM Users WHERE Nome LIKE '%"+user.getNome()+"%'");
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                user.setId_User(rs.getInt("Id_User"));
                user.setNome(rs.getString("Nome"));
                user.setEmail(rs.getString("Email"));
                user.setUser(rs.getString("User"));
                user.setSenha(rs.getString("Senha"));
            }
            
            rs.close();
            stmt.close();
            
        } catch (SQLException e){
            throw new RuntimeException (e);
        }
    }
    
    public void Pesquisar(Users user){
        try{
            PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM Users WHERE Id_User = "+user.getId_User());
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                user.setId_User(rs.getInt("Id_User"));
                user.setNome(rs.getString("Nome"));
                user.setEmail(rs.getString("Email"));
                user.setUser(rs.getString("User"));
                user.setSenha(rs.getString("Senha"));
            }
            
            rs.close();
            stmt.close();
            
        } catch (SQLException e){
            throw new RuntimeException (e);
        }
    }
     
    public void RemoverCadastroUsers(Users user){
        try{
            
            PreparedStatement stmt = connection.prepareStatement("DELETE FROM Users WHERE Id_User = ?");
            
            stmt.setInt(1, user.getId_User());
            
            stmt.execute();
            stmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void VerificarEmailIgual2(Users user, JFrame frame, FrmConsUserAdmin fcua) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM Users WHERE Email LIKE ? AND Id_User NOT LIKE ?");
            
            stmt.setString(1, user.getEmail());
            stmt.setInt(2, user.getId_User());
            
            ResultSet rs = stmt.executeQuery();
                   
            if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Este email já consta no sistema!\nCaso ninguém tenha efetuado o cadastro,\nmande-nos um email: chatiete@help.com\ne ficaremos felizes em ajudá-lo(a)!");
                        fcua.EmailIgual();
                    }else{
                    UsersDAO userDAO = new UsersDAO();
                    userDAO.VerificarUsuarioIgual2(user, frame, fcua);
                    }
                    
                   rs.close();
                    stmt.close();
                    
         } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void VerificarUsuarioIgual2(Users user, JFrame frame, FrmConsUserAdmin fcua) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM Users WHERE User LIKE ? AND Id_User NOT LIKE ?");
            
            stmt.setString(1, user.getUser()); 
            stmt.setInt(2, user.getId_User());
            
            ResultSet rs = stmt.executeQuery();
                   
            if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Este nome de usuário já está em uso!\nPor Favor, escolha outro!");
                        fcua.UsuarioIgual();
                    }else{
                    UsersDAO userDAO = new UsersDAO();
                    userDAO.AlterarCadUser(user);
                    JOptionPane.showMessageDialog(null, "Dados Alterados Com Sucesso!");
                    fcua.LimparTudo();
                    }
                    
                   rs.close();
                    stmt.close();
                    
         } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void VerificarEmailIgual3(Users user, JFrame frame, FrmConsUser fcu) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM Users WHERE Email LIKE ? AND Id_User NOT LIKE ?");
            
            stmt.setString(1, user.getEmail());
            stmt.setInt(2, user.getId_User());
            
            ResultSet rs = stmt.executeQuery();
                   
            if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Este email já consta no sistema!\nCaso ninguém tenha efetuado o cadastro,\nconverse com o administrador do sistema na sua filial\nou mande-nos um email: chatiete@help.com\ne ficaremos felizes em ajudá-lo(a)!");
                        fcu.EmailIgual();
                    }else{
                    UsersDAO userDAO = new UsersDAO();
                    userDAO.VerificarUsuarioIgual3(user, frame, fcu);
                    }
                    
                   rs.close();
                    stmt.close();
                    
         } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void VerificarUsuarioIgual3(Users user, JFrame frame, FrmConsUser fcu) {
        try {
            PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM Users WHERE User LIKE ? AND Id_User NOT LIKE ?");
            
            stmt.setString(1, user.getUser()); 
            stmt.setInt(2, user.getId_User());
            
            ResultSet rs = stmt.executeQuery();
                   
            if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Este nome de usuário já está em uso!\nPor Favor, escolha outro!");
                        fcu.UsuarioIgual();
                    }else{
                    UsersDAO userDAO = new UsersDAO();
                    userDAO.AlterarCadUser(user);
                    JOptionPane.showMessageDialog(null, "Dados Alterados Com Sucesso!");
                    fcu.LimparTudo();
                    fcu.Pesq();
                    }
                    
                   rs.close();
                    stmt.close();
                    
         } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void AlterarCadUser(Users user) {
        String sql = "UPDATE Users SET Nome = ?, "+"Email = ?, "+"User = ?, "+"Senha = ?"+" WHERE Id_User = ?;";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getUser());
            stmt.setString(4, user.getSenha());
            stmt.setInt(5, user.getId_User());

            stmt.execute();
            stmt.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }

    }
    
}
