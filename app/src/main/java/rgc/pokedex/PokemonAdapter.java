package rgc.pokedex;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Raúl on 15/10/2016.
 */
public class PokemonAdapter extends BaseAdapter {
    protected Activity activity;
    protected ArrayList<Pokemon> pokemones;

    public PokemonAdapter(Activity activity, ArrayList<Pokemon> pokemones) {
        super();
        this.activity = activity;
        this.pokemones = pokemones;
    }

    @Override
    public int getCount() {
        return pokemones.size();
    }

    @Override
    public Object getItem(int i) {
        return pokemones.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v =view;
        LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.pokemon_item,null);
        Pokemon pokemon = pokemones.get(i);
        ImageView ico =(ImageView) v.findViewById(R.id.imageico);
        ico.setImageResource(pokemon.getIcon());
        TextView num = (TextView) v.findViewById(R.id.textnump);
        num.setText(Integer.toString(pokemon.getNumPoke()));
        TextView name = (TextView) v.findViewById(R.id.textname);
        name.setText(pokemon.getName());
        return v;
    }
}
