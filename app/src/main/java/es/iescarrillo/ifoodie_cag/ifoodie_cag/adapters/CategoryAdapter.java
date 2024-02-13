package es.iescarrillo.ifoodie_cag.ifoodie_cag.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import es.iescarrillo.ifoodie_cag.R;
import es.iescarrillo.ifoodie_cag.ifoodie_cag.models.Category;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    private Context context;
    private List<Category> categories;


    public CategoryAdapter(Context context, List<Category> categories){
        this.context=context;
        this.categories=categories;
    }
    //Metodo en el que se indica la vista (xml) que vamos a inflar (inflate)
    @NonNull
    @Override
    public CategoryAdapter.CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Indicamos la vista que queremos infla
        View view = LayoutInflater.from(context).inflate(R.layout.item_category, parent, false);
        //Casteamos esa vista en un viewholder
        return new CategoryViewHolder(view);
    }

    //Metodo en el que vamos a modificar los componentes (imageview y textview) de la imagen que hemos inflado antes
    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.CategoryViewHolder holder, int position) {
        //Obtenemos el objeto según la posición en la lista
        Category category = categories.get(position);

        //Modificamos los componentes
        holder.tvTitle.setText(category.getTitle());
        holder.imgCategory.setImageResource(category.getImage());


    }

    //Numero de elementos de la lista de objetos
    @Override
    public int getItemCount() {
        return categories.size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgCategory;
        private TextView tvTitle;

        public CategoryViewHolder(@NonNull View itemView){
            super(itemView);

            //Vamos a inicializar los componentes
            imgCategory=itemView.findViewById(R.id.ivBurger);
            tvTitle=itemView.findViewById(R.id.tvBurger);
        }

    }
}
