import Celular.CelularApple;
import Celular.ICelular;
import Celular.CelularSamsung;
import Reloj.IReloj;
import Reloj.RelojApple;
import Reloj.RelojSamsung;

public class TiendaAppleFactory extends TiendaAbstractFactory {
    @Override
    public ICelular createCelular() {
        ICelular celular = new CelularApple();
        return celular;
    }

    @Override
    public IReloj createReloj() {
        IReloj reloj = new RelojApple();
        return reloj;
    }
}