# JavaPatternProject

java模式学习手记

### 1.UML
UML 2.2中一共定义了14种图示，分类如下:
* 结构式图形：强调的是系统式的建模   
* 行为式图形：强调系统模型中触发的事件
* 交互式图形：属于行为式图形子集合，强调系统模型中资料流程

#### 1.1 结构式图形
1. 静态图(类图，对象图，包图)
2. 实现图(组件图，部署图)
3. 剖面图
4. 复合结构图

#### 1.2 行为式图形
1. 活动图
2. 状态图
3. 用例图

#### 1.3 交互式图形
1. 通信图
2. 交互概述图(UML 2.0)
3. 时序图(UML 2.0)
4. 时间图(UML 2.0)

### 2.六大原则
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
定义：如果对每一个类型为T1的对象o1，都有类型为T2的对象o2,使得以T1定义的所有程序P在所有的对象o1都替换成o2时，程序P的行为没有发生变化，那么类型T2是类型T1的子类。
<br/>
定义扩展：一个软件实体如果适用一个父类的话，那一定适用于其子类，所有引用父类的地方必须能透明地使用其子类的对象，子类对象能够替换父类对象，而程序逻辑不变。
<br/>
引申意义：子类可以扩展父类的功能，但不能改变父类原有的功能。
* 含义1：子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法
* 含义2：子类中可以增加自己特有的方法
* 含义3：当子类的方法重载父类的方法时，方法的前置条件(即方法的输入/入参)要比父类方法的输入参数更宽松
* 含义4：当子类的方法实现父类的方法时(重写/重载或实现)，方法的后置条件(即方法的输出/返回值)要比父类更严格或相等

优点1：约束继承泛滥，开闭原则的一种提现
<br/>
优点2：加强程序的健壮性，同时变更时也可以做到非常好的兼容性，提高程序的维护性、扩展性。降低需求变更时引入的风险。

#### 2.7 合成/复用原则(组合/复用原则)
定义：尽量使用对象组合/聚合，而不是继承关系达到软件复用的目的<br/>
聚合has-A 组合contains-A 继承is-A<br/>
优点：可以使系统更加灵活，降低类与类之间的耦合度，一个类的变化对其他类造成的影响相对较少
<br/>

### 3.二十三种设计模式
创建型设计模式