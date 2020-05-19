package cj.netos.rc.wybank.mapper;

import cj.netos.rc.wybank.model.ShuntinLedger;
import cj.netos.rc.wybank.model.ShuntinLedgerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShuntinLedgerMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(ShuntinLedgerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(ShuntinLedgerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(ShuntinLedger record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(ShuntinLedger record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<ShuntinLedger> selectByExample(ShuntinLedgerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    ShuntinLedger selectByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") ShuntinLedger record, @Param("example") ShuntinLedgerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") ShuntinLedger record, @Param("example") ShuntinLedgerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(ShuntinLedger record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(ShuntinLedger record);
}