package com.example.springbootfordata;

import com.example.springbootfordata.mysql.domain.PmsProduct;
import com.example.springbootfordata.mysql.mapper.IPmsProductMapper;
import com.example.springbootfordata.mysql.service.ICmsSubjectService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootFordataApplicationTests {

    @Resource
    IPmsProductMapper pmsProductMapper;
    @Autowired
    ICmsSubjectService cmsSubjectService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testService() {
        cmsSubjectService.getAllSubject();
    }

    @Test
    public void insertData() {
        List<PmsProduct> demoProductList = new ArrayList<>();
        int startIndex = 10000;
        int endIndex = 50000;
        for (int i = startIndex; i <= endIndex; i++) {
            PmsProduct product = PmsProduct.builder()
                    .brandId((long) getRandomNum(1, 100))
                    .productCategoryId((long) getRandomNum(1, 100))
                    .productAttributeCategoryId((long) getRandomNum(0, 5))
                    .feightTemplateId((long) getRandomNum(1, 100))
                    .productCategoryId((long) getRandomNum(1, 100))
                    .name(getRandomString(1))
                    .pic(getRandomString(4))
                    .productSn("No" + getRandomNum(10000, 50000))
                    .deleteStatus(0)
                    .publishStatus(0)
                    .newStatus(0)
                    .recommandStatus(0)
                    .verifyStatus(1)
                    .sort(i)
                    .sale(getRandomNum(100, 1000000))
                    .price(BigDecimal.valueOf(getRandomNum(1, 10000)))
                    .promotionPrice(BigDecimal.valueOf(getRandomNum(1, 1000)))
                    .giftGrowth(getRandomNum(1, 10))
                    .giftPoint(getRandomNum(1, 20))
                    .usePointLimit(getRandomNum(1, 20))
                    .originalPrice(BigDecimal.valueOf(getRandomNum(1, 100)))
                    .stock(getRandomNum(1, 1000))
                    .lowStock(getRandomNum(100, 200))
                    .unit("unit")
                    .weight(BigDecimal.valueOf(getRandomNum(100, 10000)))
                    .previewStatus(getRandomNum(0, 1))
                    .promotionStartTime(new Date())
                    .brandName(getRandomString(2))
                    .subTitle(getRandomString(2))
                    .build();
            demoProductList.add(product);
        }
        long startTime = System.currentTimeMillis();
        pmsProductMapper.batchInsertSelective(demoProductList);
        long endTime = System.currentTimeMillis();
        System.out.println("***插入条数：" + (endIndex - startIndex) + "；耗时(S)：" + (endTime - startTime) / 1000);
    }

    private static int getRandomNum(int min, int max) {
        return (int) (min + Math.random() * (max - min + 1));
    }

    private static String getRandomString(int times) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < times; i++) {
            s = s.append(UUID.randomUUID().toString());
        }
        return s.toString();
    }
}
