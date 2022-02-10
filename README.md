# JavaPatternProject

java模式学习手记

###1.UML
UML 2.2中一共定义了14种图示，分类如下:
* 结构式图形：强调的是系统式的建模   
* 行为式图形：强调系统模型中触发的事件
* 交互式图形：属于行为式图形子集合，强调系统模型中资料流程

####1.1 结构式图形
1. 静态图(类图，对象图，包图)
2. 实现图(组件图，部署图)
3. 剖面图
4. 复合结构图

####1.2 行为式图形
1. 活动图
2. 状态图
3. 用例图

####1.3 交互式图形
1. 通信图
2. 交互概述图(UML 2.0)
3. 时序图(UML 2.0)
4. 时间图(UML 2.0)

###2.六大原则
* 开闭原则
* 依赖倒置原则
* 单一职责原则
* 接口隔离原则
* 迪米特法则(最少知道原则)
* 里氏替换原则
* 合成/复用原则(组合/复用原则)

#### 2.1 开闭原则
定义：一个软件实体如类、模块和函数应该对扩展开放，对修改关闭<br/>
用抽象构架框架，用实现扩展细节<br/>
优点：提高软件系统的可复用性及可维护性


#### 2.2 依赖倒置原则
定义：高层模块不应该依赖底层模块，二者都应该依赖其抽象<br/>
针对接口编程，不要针对实现编程<br/>
优点：可以减少类间的耦合性，提高系统稳定性，提高代码可读性和可维护性，可降低修改程序所造成的风险<br/>

#### 2.3 单一职责原则
定义：不要存在多于一个导致类变更的原因<br/>
一个类/接口/方法只负责一项职责<br/>
优点：降低类的复杂度、提高类的可读性，提供系统的可维护性、降低变更引起的风险。

#### 2.4 接口隔离原则
定义：用多个专门的接口，而不使用单一的总接口，客户端不应该依赖它不需要的接口<br/>
一个类对一个类的依赖应该建立在最小的接口上<br/>
建立单一接口，不要建立庞大臃肿的接口<br/>
尽量细化接口，接口中的方法尽量少<br/>
注意适度原则，一定要适度<br/>
优点：符合我们常说的高内聚低耦合的设计思想，从而使得类具有很好的可读性、可扩展性和可维护性。

#### 2.5 迪米特法则(最少知道原则)
定义：一个对象应该对其他对象保持最少的了解。又叫最少知道原则<br/>
尽量降低类与类之间的耦合<br/>
优点：降低类之间的耦合

#### 2.6 里氏替换原则


#### 2.7 合成/复用原则(组合/复用原则)