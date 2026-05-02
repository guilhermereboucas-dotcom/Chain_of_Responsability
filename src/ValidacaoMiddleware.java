public class ValidacaoMiddleware extends Middleware{
    @Override
    public boolean processar(Requisicao req) {
        if (req.isDadosValidos()){
            if(!(proximo == null)) {
                return proximo.processar(req);
            }
            return true;
        }
        System.out.println("VALIDAÇÃO: Dados inválidos");
        return false;
    }
}
