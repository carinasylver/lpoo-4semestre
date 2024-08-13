public class ExcecaoVerificadaTryCatchFinally {

        public static void main(String[] args) {
            comportamento1(); //chamada do metodo
        }

        private static void comportamento1(){
            comportamento2();
        }
        private static void comportamento2(){
            //divisao por zero
            //System.out.println(10/0); //lança a exceção runtimeException com a pilha de exceçao e a msg da causa e a classe da excecao
            //System.out.println("executou todas as chamadas");//eh executada se for comentada a linha acima

            //throwException(); //excecao verificada pelo compilador

            //try-catch eh um unico comando, deve vir juntos
            try{ //tente execucao essa linha se nao der lance uma excecao
                throwException(); //gera a excecao verificada pelo compilador
            }catch (Exception exception){ //pega a excecao gerada no bloco try
                exception.printStackTrace();//imprime a pilha(stack) de exceção
            }
        }

        /*lança uma excecao verificada*/
        /*segundo deitel(2010), todas as classes q sao herdadas das da classe exception, mas nao direta ou indiretamente da classe */
        /* runtimeException, sao consideradas exceçoes verificadas*/
        private static void throwException() throws Exception{  //metodo que lança a exceção Exception
            //try-catch eh um unico comando, deve vir juntos
            try{
                System.out.println("Method throwException");
                throw new Exception(); //gera a excecao
            }catch (Exception exception){ //pega a excecao gerada no bloco try
                System.err.println("Exception handled in method throwException");
                throw exception; //rethrow for further processing
            }
            finally { //executes regardless of what occurs in try.. catch. finally eh sempre executado
                System.err.println("finally executed in throwException");
            }

        }

        //classe conta
        class Conta{
            private Double saldo=0.0;

            public Conta(Double saldo) {
                this.saldo = saldo;
            }

            public Double getSaldo() {
                return saldo;
            }

            public void setSaldo(Double saldo) {
                this.saldo = saldo;
            }

            @Override
            public String toString() {
                return "Conta{" +
                        "saldo=" + saldo +
                        '}';
            }
        }




}
