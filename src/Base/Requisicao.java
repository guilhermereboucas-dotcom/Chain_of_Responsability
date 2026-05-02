package Base;

public class Requisicao {

    private String usuario;
    private String token;
    private String permissao;
    private boolean dadosValidos;

    public Requisicao(String usuario, String token, String permissao, boolean dadosValidos) {
        this.usuario = usuario;
        this.token = token;
        this.permissao = permissao;
        this.dadosValidos = dadosValidos;
    }

    public Requisicao(){}

    public boolean isDadosValidos() {
        return dadosValidos;
    }

    public void setDadosValidos(boolean dadosValidos) {
        this.dadosValidos = dadosValidos;
    }

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
