package jmym.com.ms_auth.service;

import java.util.List;
import java.util.Optional;

import jmym.com.ms_auth.dto.AuthUserDto;
import jmym.com.ms_auth.entity.AuthUser;
import jmym.com.ms_auth.entity.TokenDto;

public interface AuthUserService {
    AuthUser save (AuthUserDto authUserDto);
    TokenDto login(AuthUserDto authUserDto);
    TokenDto validate(String token);

    List<AuthUser> lista();
    Optional<AuthUser> buscarPorId(Integer id);
    AuthUser actualizar(AuthUser authUser);
}
