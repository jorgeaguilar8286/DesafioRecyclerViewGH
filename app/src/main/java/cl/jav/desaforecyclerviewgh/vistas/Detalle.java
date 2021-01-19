package cl.jav.desaforecyclerviewgh.vistas;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import cl.jav.desaforecyclerviewgh.R;

public class Detalle extends Fragment {


    private static final String TAG = "En fragmento";
    private String detalleNombre;
    private String detalleDescripcion;
    private int detalleImagen;
    private View view;


    public Detalle() {
        // Required empty public constructor
    }


    public static Detalle newInstance(String pNombre, String pDescripcion, int pImagen) {
        Detalle fragment = new Detalle();
        Bundle args = new Bundle();
        args.putString("Nombre", pNombre);
        args.putString("Descripcion", pDescripcion);
        args.putInt("Imagen", pImagen);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {


            Log.e(TAG, "fragmento on create ");
            detalleNombre = getArguments().getString("Nombre");
            detalleDescripcion = getArguments().getString("Descripcion");
            detalleImagen = getArguments().getInt("Imagen");


        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.e(TAG, "fragmento on create view ");

        view = inflater.inflate(R.layout.fragment_detalle, container, false);
        loadData();
        return view;
    }


    public void loadData() {
        Log.e(TAG, "load data ");
        ((TextView) view.findViewById(R.id.tx_nombreDetalle)).setText(detalleNombre);
        ((TextView) view.findViewById(R.id.tx_descripcion_degtalle)).setText(detalleDescripcion);
        ((ImageView) view.findViewById(R.id.iv_imagen_detalle)).setImageResource(detalleImagen);
    }
}
