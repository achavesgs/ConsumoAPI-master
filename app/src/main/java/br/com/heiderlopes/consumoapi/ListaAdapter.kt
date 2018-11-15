package br.com.heiderlopes.consumoapi

import android.content.Context
import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.View
import br.com.heiderlopes.consumoapi.model.Pokemon
import java.security.AccessControlContext
import java.util.*

class ListaAdapter(
        val pokemons: List<Pokemon>,
        val context: Context,
        val listener: (Pokemon) -> Unit){

    class ViewHolder (itemView: View):
            RecyclerView.ViewHolder(itemView){

    }
}