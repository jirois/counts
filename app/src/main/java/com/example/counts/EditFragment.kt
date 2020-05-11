package com.example.counts


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.counts.databinding.EditFragmentBinding

/**
 * A simple [Fragment] subclass.
 */
class EditFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<EditFragmentBinding>(inflater, R.layout.edit_fragment, container, false)

        binding.addBtn.setOnClickListener {v: View ->
            v.findNavController().navigate(R.id.action_editFragment_to_listFragment)

        }
        return binding.root
    }

}
