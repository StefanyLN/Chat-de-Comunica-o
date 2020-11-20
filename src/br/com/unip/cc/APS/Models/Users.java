package br.com.unip.cc.APS.Models;

public class Users {
    private int Id_User;
    private String Nome;
    private String Email;
    private String User;
    private String Senha;
    
    public int getId_User(){
        return Id_User;
    }
    
    public void setId_User(int Id_User){
        this.Id_User = Id_User;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

 }
