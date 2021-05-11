package org.honma.laboratory.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.honma.laboratory.entity.Laboratory;
import org.honma.laboratory.mapper.LaboratoryMapper;
import org.honma.laboratory.service.LaboratoryService;
import org.springframework.stereotype.Service;

/**
 * @Author: lijunjie
 * @Date: 2021/5/11
 */
@Service
public class LaboratoryServiceImpl extends ServiceImpl<LaboratoryMapper, Laboratory> implements LaboratoryService {
}
