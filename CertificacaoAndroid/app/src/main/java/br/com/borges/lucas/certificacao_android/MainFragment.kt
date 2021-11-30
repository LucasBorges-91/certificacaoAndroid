package br.com.borges.lucas.certificacao_android

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import br.com.borges.lucas.certificacao_android.databinding.FragmentMainBinding
import br.com.borges.lucas.certificacao_android.util.navTo
import br.com.borges.lucas.certificacao_android.util.toast


class MainFragment : Fragment(R.layout.fragment_main) {
    private lateinit var binding: FragmentMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

        binding.codelabToastSnake.setOnClickListener{ navTo( R.id.toastSnakeFragment ) }
    }
}