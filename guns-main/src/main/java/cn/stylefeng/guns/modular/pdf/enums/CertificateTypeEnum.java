/*
Copyright [2020] [https://www.stylefeng.cn]

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

Guns采用APACHE LICENSE 2.0开源协议，您在使用过程中，需要注意以下几点：

1.请不要删除和修改根目录下的LICENSE文件。
2.请不要删除和修改Guns源码头部的版权声明。
3.请保留源码和相关描述文件的项目出处，作者声明等。
4.分发源码时候，请注明软件出处 https://gitee.com/stylefeng/guns-separation
5.在修改包名，模块名称，项目代码等时，请注明软件出处 https://gitee.com/stylefeng/guns-separation
6.若您的项目无法满足以上几点，可申请商业授权，获取Guns商业授权许可，请在官网购买授权，地址为 https://www.stylefeng.cn
 */
package cn.stylefeng.guns.modular.pdf.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 证书类型
 *
 * @author shitou
 * @date 2021/01/10 19:37
 */
@Getter
@AllArgsConstructor
public enum CertificateTypeEnum {

    /**
     * 准考证
     */
    ADMISSION_TICKET("ADMISSION_TICKET", "准考证"),
    /**
     * 面试准考证
     */
    MS_ADMISSION_TICKET("MS_ADMISSION_TICKET", "面试准考证"),
    /**
     * 准考证两场
     */
    ADMISSION_TICKET_TOW("ADMISSION_TICKET_TOW", "准考证两场"),
    /**
     * 成绩单
     */
    TRANSCRIPT("TRANSCRIPT", "成绩单"),
    /**
     * 报名表
     */
    ENTER_NAME("ENTER_NAME", "报名表"),
    /**
     * 技能准考证
     */
    JN_ADMISSION_TICKET("JN_ADMISSION_TICKET", "技能准考证"),
    /**
     * 笔试准考证
     */
    BS_ADMISSION_TICKET("BS_ADMISSION_TICKET", "笔试准考证"),
    /**
     * 笔试成绩单
     */
    BS_TRANSCRIPT("BS_TRANSCRIPT", "笔试成绩单");


    private final String code;

    private final String message;

}
