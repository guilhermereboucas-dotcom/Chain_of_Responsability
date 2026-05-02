public class AuthMiddleware extends Middleware {

    @Override
    public boolean processar(Requisicao req) {
        if ((req.getToken().equalsIgnoreCase("valido"))){
            if(!(proximo == null)) {
                return proximo.processar(req);
            }
            return true;
        }
        System.out.println("AUTH: Token inválido → acesso negado");
        return false;
    }
}
