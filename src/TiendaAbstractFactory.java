import Celular.ICelular;
import Reloj.IReloj;


public abstract class TiendaAbstractFactory {
    public abstract ICelular createCelular();
    public abstract IReloj createReloj();

}