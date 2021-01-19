package cl.jav.desaforecyclerviewgh.modelo;
import cl.jav.desaforecyclerviewgh.R;
import java.util.ArrayList;
import java.util.List;

public class Postre {
    String nombre;
    String descripcion;
    int image;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Postre(String nombre, String descripcion, int image) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.image = image;
    }

    @Override
    public String toString() {
        return "Postre{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", image=" + image +
                '}';
    }
    public static List<Postre> getDesserts(){
        List<Postre> listaPostres=new ArrayList<>();
        listaPostres.add(new Postre("brownie banana","dulce y tropical", R.drawable.brownie_banana));
        listaPostres.add(new Postre("galletas rapidas","de ayumama y banano", R.drawable.galletas_rapidas_de_auyama_y_banano));
        listaPostres.add(new Postre("mandocas horneadas","deliciosas", R.drawable.mandocas_hormenadas));
        listaPostres.add(new Postre("muffins de pan","con zanahoria",R.drawable.muffins_de_pan_con_zanohoria));
        listaPostres.add(new Postre("muffins integrales","saludable y rico",R.drawable.muffins_integrales));
        listaPostres.add(new Postre ("palmeritas","de banana",R.drawable.palmeritas_de_banana));
        listaPostres.add(new Postre("pan de calabacin","exotico y atrevido",R.drawable.pan_de_calabacin_750x300));
        listaPostres.add(new Postre("panquecas de cacao","con toppings de banana",R.drawable.panquecas_de_cacao_con_topping_de_banana));
        return listaPostres;
    }
}
