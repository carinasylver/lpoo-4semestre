public class PilhaDeExcecao {

        public static void main(String[] args) {
        /*---divisao por zero
        //System.out.println(10/0);

        /*---nullPointerException(ponteiro nul)---*/
            //Conta conta1 = null; //ponteiro eh nulo, ou seja nao existe, deveria ter um new
            //Conta conta1 = new Conta(100.0);
            //System.out.println(conta1.toString());

            /*-- analisando a pilha de exceçao --*/
            comportamento1(); //chamada do metodo
        }

        private static void comportamento1(){
            comportamento2();
        }
        private static void comportamento2() {
            //divisao por zero
            System.out.println(10/0); //lança a exceção runtimeexception com a pilha de exceçao e a msg da causa e a classe da excecao
            //System.out.println("executou todas as chamadas");//eh executada se for comentada a linha acima

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




