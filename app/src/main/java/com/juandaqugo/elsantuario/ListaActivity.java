package com.juandaqugo.elsantuario;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ListaActivity extends AppCompatActivity {
   // String[] parques = new String[] {"Bolivar", "La Libertad"};
    ListView list;

    private Lista_Entrada [] datos= new Lista_Entrada[]{
            new Lista_Entrada(R.drawable.elsantuario, "Parque de Bolivar", "Parque  principal", "Cra8 "),
            new Lista_Entrada(R.drawable.elsantuario, "Parque el lago", "Parque 1 ", "Cra7")
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        //Adapter adapter = new Adapter(this, datos);
        list = (ListView) findViewById(R.id.list);
       // ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, parques);
       // list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
           //     String data = ( (Lista_Entrada)parent.getItemAtPosition(position)).getnombre();
            //    Toast.makeText(getApplicationContext(),data,Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ListaActivity.this, HotelesActivity.class);
                startActivity(intent);

                }

        });
    }
    /* class Adapter extends ArrayAdapter<Lista_Entrada>{

        public Adapter(Context context, int Lista_Entrada[] datos) {
            super(context, R.layout.list_item,datos);
        }

        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            View item = inflater.inflate(R.layout.list_item,null);

            TextView nombre= (TextView) item.findViewById(R.id.tnombre);
            nombre.setText(datos[position].getNombre);

            TextView descrip = (TextView) item.findViewById(R.id.tdescrip);
            descrip.setText(datos[position].getdescrip);

            TextView direc = (TextView) item.findViewById(R.id.tdirec);
            direc.setText(datos[position].getdirec);

            ImageView imagen = (ImageView) item.findViewById(R.id.ifoto);
            imagen.setImageResource(datos[position].getIdImagen);
            return item;
        }
    } */
}
