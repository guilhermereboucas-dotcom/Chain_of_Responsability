package Middlewares;

import Base.Middleware;
import Base.Requisicao;

public class ControllerMiddleware extends Middleware {
    @Override
    public boolean processar(Requisicao req) {
        System.out.println("CONTROLLER: Requisição processada com sucesso");
        return true;
    }
}
