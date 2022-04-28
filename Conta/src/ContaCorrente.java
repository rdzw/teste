import java.util.prefs.Preferences;

public class ContaCorrente {
    String numero;
    String agencia;
    boolean especial;
    double limiteEspecial;
    double saldo;

    boolean realizarSaque(double quantiaASacar){

        //tem saldo na conta
        if (saldo>=quantiaASacar){
            saldo-= quantiaASacar;
            return true;
        }else { //nao tem saldo
            if (especial){
                //verificar o limte especial tem saldo
                double limite = limiteEspecial + saldo;
                if (limite>=quantiaASacar){
                    saldo-=quantiaASacar;
                    return true;
                }else {
                    return false;
                }
                }else{
                    return false; // nao é especial e nao tem saldo suficiente

                }
            }
        }

    void depositar(double valorDepositado){
        saldo += valorDepositado;
    }
    void  consultarSaldo(){
        System.out.println("saldo atual da conta = "  + saldo);
    }
}
