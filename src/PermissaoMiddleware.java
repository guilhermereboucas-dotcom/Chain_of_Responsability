public class PermissaoMiddleware extends Middleware{
    @Override
    public boolean processar(Requisicao req) {
        if ((req.getPermissao().equalsIgnoreCase("admin"))){
            if(!(proximo == null)) {
                return proximo.processar(req);
            }
            return true;
        }
        System.out.println("PERMISSÃO: Acesso negado");
        return false;
    }
}

