package br.com.borges.lucas.certificacao_android

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.borges.lucas.certificacao_android.databinding.ActivityMainBinding
import br.com.borges.lucas.certificacao_android.databinding.FragmentMainBinding


class MainFragment : Fragment(R.layout.fragment_main) {
    private lateinit var binding: FragmentMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
    }
}