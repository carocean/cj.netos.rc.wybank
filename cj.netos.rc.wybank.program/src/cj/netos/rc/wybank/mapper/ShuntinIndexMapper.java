package cj.netos.rc.wybank.mapper;

import cj.netos.rc.wybank.model.ShuntinIndex;
import cj.netos.rc.wybank.model.ShuntinIndexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShuntinIndexMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(ShuntinIndexExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(ShuntinIndexExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(ShuntinIndex record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(ShuntinIndex record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<ShuntinIndex> selectByExample(ShuntinIndexExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    ShuntinIndex selectByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") ShuntinIndex record, @Param("example") ShuntinIndexExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") ShuntinIndex record, @Param("example") ShuntinIndexExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(ShuntinIndex record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(ShuntinIndex record);
}