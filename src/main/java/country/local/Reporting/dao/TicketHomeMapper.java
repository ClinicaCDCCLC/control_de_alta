/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country.local.Reporting.dao;

import country.local.Reporting.models.TicketHomeResult;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 *
 * @author ctorrest
 */
@Mapper
public interface TicketHomeMapper {

    @Select("select * from VwBoletoCasa order by codCama")
    public List<TicketHomeResult> findAll();

    @Select("select * from VwBoletoCasa where idUbicacion = #{idUbicacion} order by codCama")
    public List<TicketHomeResult> findByIdUbicacion(@Param("idUbicacion") int idUbicacion);
}
