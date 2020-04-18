package com.example.springbootfordata.mysql.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PmsProduct {
    private Long id;

    private Long brandId;

    private Long productCategoryId;

    private Long feightTemplateId;

    private Long productAttributeCategoryId;

    private String name;

    private String pic;

    private String productSn;

    private Integer deleteStatus;

    private Integer publishStatus;

    private Integer newStatus;

    private Integer recommandStatus;

    private Integer verifyStatus;

    private Integer sort;

    private Integer sale;

    private BigDecimal price;

    private BigDecimal promotionPrice;

    private Integer giftGrowth;

    private Integer giftPoint;

    private Integer usePointLimit;

    private String subTitle;

    private BigDecimal originalPrice;

    private Integer stock;

    private Integer lowStock;

    private String unit;

    private BigDecimal weight;

    private Integer previewStatus;

    private String serviceIds;

    private String keywords;

    private String note;

    private String albumPics;

    private String detailTitle;

    private Date promotionStartTime;

    private Date promotionEndTime;

    private Integer promotionPerLimit;

    private Integer promotionType;

    private String brandName;

    private String productCategoryName;
    /**
     * 商品描述
     */
    private String description;

    private String detailDesc;

    /**
     * 产品详情网页内容
     */
    private String detailHtml;

    /**
     * 移动端网页详情
     */
    private String detailMobileHtml;

}