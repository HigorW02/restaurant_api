package nassau.restaurant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nassau.restaurant.dto.UsuarioDTO;
import nassau.restaurant.model.Endereco;
import nassau.restaurant.model.Usuario;
import nassau.restaurant.repository.EnderecoRepository;
import nassau.restaurant.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Usuario> listarTodos() {
        return usuarioRepository.findAll();
    }

    public Usuario salvar(UsuarioDTO dto) {
        Usuario usuario = new Usuario();
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(dto.getSenha());
        usuario.setTelefone(dto.getTelefone());

        Endereco endereco = enderecoRepository.findById(dto.getEnderecoId())
            .orElseThrow(() -> new RuntimeException("Endereço não encontrado"));

        usuario.setEndereco(endereco);

        return usuarioRepository.save(usuario);
    }
}
