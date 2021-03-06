package org.jinyuanjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.jinyuanjava.litemall.db.domain.ViewAuctionDajiaOrderCurrent;
import org.jinyuanjava.litemall.db.domain.ViewAuctionDajiaOrderCurrentExample;

public interface ViewAuctionDajiaOrderCurrentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_auction_dajia_order_current
     *
     * @mbg.generated
     */
    long countByExample(ViewAuctionDajiaOrderCurrentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_auction_dajia_order_current
     *
     * @mbg.generated
     */
    int deleteByExample(ViewAuctionDajiaOrderCurrentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_auction_dajia_order_current
     *
     * @mbg.generated
     */
    int insert(ViewAuctionDajiaOrderCurrent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_auction_dajia_order_current
     *
     * @mbg.generated
     */
    int insertSelective(ViewAuctionDajiaOrderCurrent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_auction_dajia_order_current
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ViewAuctionDajiaOrderCurrent selectOneByExample(ViewAuctionDajiaOrderCurrentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_auction_dajia_order_current
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    ViewAuctionDajiaOrderCurrent selectOneByExampleSelective(@Param("example") ViewAuctionDajiaOrderCurrentExample example, @Param("selective") ViewAuctionDajiaOrderCurrent.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_auction_dajia_order_current
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<ViewAuctionDajiaOrderCurrent> selectByExampleSelective(@Param("example") ViewAuctionDajiaOrderCurrentExample example, @Param("selective") ViewAuctionDajiaOrderCurrent.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_auction_dajia_order_current
     *
     * @mbg.generated
     */
    List<ViewAuctionDajiaOrderCurrent> selectByExample(ViewAuctionDajiaOrderCurrentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_auction_dajia_order_current
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ViewAuctionDajiaOrderCurrent record, @Param("example") ViewAuctionDajiaOrderCurrentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_auction_dajia_order_current
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ViewAuctionDajiaOrderCurrent record, @Param("example") ViewAuctionDajiaOrderCurrentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table view_auction_dajia_order_current
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") ViewAuctionDajiaOrderCurrentExample example);
}