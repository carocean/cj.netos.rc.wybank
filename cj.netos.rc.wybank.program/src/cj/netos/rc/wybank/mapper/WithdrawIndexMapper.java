package cj.netos.rc.wybank.mapper;

import cj.netos.rc.wybank.model.WithdrawIndex;
import cj.netos.rc.wybank.model.WithdrawIndexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WithdrawIndexMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(WithdrawIndexExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(WithdrawIndexExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(WithdrawIndex record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(WithdrawIndex record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<WithdrawIndex> selectByExample(WithdrawIndexExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    WithdrawIndex selectByPrimaryKey(String id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") WithdrawIndex record, @Param("example") WithdrawIndexExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") WithdrawIndex record, @Param("example") WithdrawIndexExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(WithdrawIndex record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(WithdrawIndex record);
}