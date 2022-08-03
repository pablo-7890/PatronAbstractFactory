import Celular.ICelular;
import Celular.CelularSamsung;
import Reloj.IReloj;
import Reloj.RelojSamsung;

public class TiendaSamsungFactory extends TiendaAbstractFactory {
    @Override
    public ICelular createCelular() {
        ICelular celular = new CelularSamsung();
        return celular;
    }

    @Override
    public IReloj createReloj() {
        IReloj reloj = new RelojSamsung();
        return reloj;
    }
}
