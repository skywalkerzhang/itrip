package org.hzdb.auth.service;

import org.hzdb.beans.pojo.dto.OutDto;
import org.hzdb.beans.pojo.entity.ItripUser;

public interface UserService {
    OutDto selectByLogin(String name, String password,String src);

    OutDto regedit(String userCode, String userName, String userPassword);

    OutDto activeUser(String user, String code);

    OutDto checkUser(String name);

    OutDto logout(String token);

    OutDto retoken(String token);
}
