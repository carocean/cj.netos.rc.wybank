package cj.netos.rc.wybank.mapper;

import cj.netos.rc.wybank.model.WithdrawLedger;
import cj.netos.rc.wybank.model.WithdrawLedgerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WithdrawLedgerMapper {

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(WithdrawLedgerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(WithdrawLedgerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(WithdrawLedger record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(WithdrawLedger record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<WithdrawLedger> selectByExample(WithdrawLedgerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    WithdrawLedger selectByPrimaryKey(String sn);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("record") WithdrawLedger record, @Param("example") WithdrawLedgerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("record") WithdrawLedger record, @Param("example") WithdrawLedgerExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(WithdrawLedger record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(WithdrawLedger record);
}