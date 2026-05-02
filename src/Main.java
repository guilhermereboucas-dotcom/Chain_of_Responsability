public class Main {
    public static void main(String[] args) {

        AuthMiddleware auth  =  new AuthMiddleware();
        PermissaoMiddleware permissao = new PermissaoMiddleware();
        ValidacaoMiddleware validacao = new ValidacaoMiddleware();
        LogMiddleware log = new LogMiddleware();
        ControllerMiddleware controller = new ControllerMiddleware();

        auth.setProximo(permissao);
        permissao.setProximo(validacao);
        validacao.setProximo(log);
        log.setProximo(controller);

        System.out.println("------CENÁRIO 1------");
        auth.processar(new Requisicao("admin","valido","admin",true));

        System.out.println("\n------CENÁRIO 2------");
        auth.processar(new Requisicao("admin","invalido","admin",true));

        System.out.println("\n------CENÁRIO 3------");
        auth.processar(new Requisicao("admin","valido","junior",true));

        System.out.println("\n------CENÁRIO 4------");
        auth.processar(new Requisicao("admin","valido","admin",false));

    }
}
