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
package cn.stylefeng.guns.modular.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 考試状态
 *
 * @author shitou
 * @date 2021/01/10 19:37
 */
@Getter
@AllArgsConstructor
public enum ExamStatusEnum {

    /**
     * 未设置
     */
    NOT_SET("NOT_SET", "未设置"),

    /**
     * 未发布
     */
    NOT_RELEASE("NOT_RELEASE", "未发布"),

    /**
     * 已发布
     */
    IS_RELEASE("IS_RELEASE", "已发布"),
    /**
     * 进行中
     */
    GET_ON("GET_ON", "进行中"),
    /**
     * 已结束
     */
    END("END", "已结束");

    private final String code;

    private final String message;

}
