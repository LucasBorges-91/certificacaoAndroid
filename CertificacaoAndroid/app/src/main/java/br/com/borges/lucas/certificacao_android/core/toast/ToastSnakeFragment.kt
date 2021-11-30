package br.com.borges.lucas.certificacao_android.core.toast

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import br.com.borges.lucas.certificacao_android.R
import br.com.borges.lucas.certificacao_android.databinding.FragmentToastSnakeBinding
import br.com.borges.lucas.certificacao_android.util.toast
import com.google.android.material.snackbar.Snackbar

class ToastSnakeFragment : Fragment( R.layout.fragment_toast_snake ) {
    private lateinit var binding: FragmentToastSnakeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        requireActivity().requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED

        binding = FragmentToastSnakeBinding.bind( view )

        binding.toast.setOnClickListener{
            val msg = "Minha mensagem para você!"
            Toast
                .makeText( requireContext(), msg, Toast.LENGTH_SHORT )
                .show()
        }

        binding.snake.setOnClickListener{
            Snackbar.make( view, "Oi snake", Snackbar.LENGTH_SHORT ).show()
        }

        binding.snakeAction.setOnClickListener{
            Snackbar
                .make( view, "Snake with Action", Snackbar.LENGTH_SHORT )
                .setAction( R.string.ok ) { toast( "I am a snake!" ) }
                .show()
        }
    }
}
