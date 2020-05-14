package com.example.counts


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
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

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.add_menu, menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.listFragment -> {
                saveItem()
                return true
            }
            else -> return super.onOptionsItemSelected(item)

        }
    }

    private fun saveItem() {

    }
}
