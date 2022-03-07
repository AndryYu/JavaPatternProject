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
<h4>创建型设计模式</h4>
#### 3.1工厂方法
定义：定义一个创建对象的接口，但让实现这个接口的类来决定实例化哪个类，工厂方法让类的实例化推迟到子类中进行。
<br/>
适用场景：
* 创建对象需要大量重复的代码
* 客户端(应用层)不依赖于产品类实例如何被创建、实现等细节
* 一个类通过其子类来指令创建哪个对象

优点：
* 用户只需要关心所需产品对应的工厂，无需关心创建细节
* 加入新产品符合关闭原则，提高扩展性

缺点：
* 类的个数容易过多，增加复杂度
* 增加了系统的抽象性和理解难度

#### 3.2抽象工厂
定义：抽象工厂模式提供一个创建一系列相关或相互依赖对象的接口<br/>
无须指定它们具体的类<br/>
适用场景：
* 客户端(应用层)不依赖于产品类实例如何被创建、实现等细节
* 强调一系列相关的产品对象(属于同一产品族)一起使用创建对象需要大量重复的代码
* 提供一个产品类的库，所有的产品以同样的接口出现，从而使客户端不依赖于具体实现

优点：
* 具体产品在应用层 代码隔离，无须关心创建细节
* 将一个系列的产品族捅一到一起创建

缺点：
* 规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口
* 增加了系统的抽象性和理解难度

#### 3.3建造者
定义：将一个复杂对象的构建与它的表示分离，使得同样的构建过程以创建不同的表示<br/>
用户只需置顶需要建造的类型就可以得到它们，建造过程及细节不需要知道<br/>
适用场景
* 如果一个对象有非常复杂的内部结构(很多属性)
* 想把复杂对象的创建和使用分离

优点：
* 封装性好，创建和使用分离
* 扩展性好、建造类之间独立、一定程度上解耦

缺点：
* 产生多余的Builder对象
* 产品内部发生变化，建造者都要修改，成本较大

#### 3.4单例模式
定义：保证一个类仅有一个实例，并提供一个全局访问点<br/>
适用场景：
* 想确保任何情况下都绝对只有一个实例

优点：
* 在内存里只有一个实例，减少了内存开销
* 可以避免对资源的多重占用
* 设置全局访问点，严格控制访问

缺点：
* 没有接口，扩展困难

单线程<br/>
![](image/02-25-172654.png)

多线程<br/>
![](image/02-25-175509.png)

静态内部类<br/>
![](image/02-28-101541.png)

#### 3.5原型模式
定义：指原型实例指定创建对象的对象，并且通过拷贝这些原型创建新的对象<br/>
不需要知道任何创建的细节，不调用构造函数<br/>

适用场景：
* 类初始化消费较多资源
* new 产生的一个对象需要非常繁琐的过程(数据准备、访问权限等)
* 构造函数比较复杂
* 循环体中生产大量对象时

优点：
* 原型模式性能比直接new 一个对象性能高
* 简化创建过程

缺点：
* 必须配备克隆方法
* 对克隆复杂对象或对克隆出的对象进行复杂拷贝
* 深拷贝、浅拷贝要运用得当

<h4>结构型模式
#### 3.6外观模式
定义：又叫门面模式，提供了一个统一的接口，用来访问子系统中的一群接口<br/>
外观模式定义了一个高层接口，让子系统更容易使用<br/>

适用场景：
* 子系统越来越复杂，增加外观模式提供简单调用接口
* 构建多层系统结构，利用外观对象作为每层的入口，简化层间调用

优点：
* 简化了调用过程，无需了解深入子系统，防止带来风险
* 减少系统依赖，松散耦合
* 更好的划分访问层次
* 符合迪米特法则，即最少知道原则

缺点：
* 增加子系统，扩展子系统行为容易引入风险
* 不符合开闭原则

#### 3.7装饰者模式
定义：在不改变原有对象的基础之上，将功能附加到对象上<br/>
提供了比继承更有弹性的替代方案(扩展原有对象功能)<br/>

适用场景：
* 扩展一个类的功能或给一个类添加附加职责
* 动态的给一个对象添加功能，这些功能可以再动态的撤销

优点：
* 继承的有力补充，比继承灵活，不改变原有对象的情况下给一个对象扩展功能
* 通过使用不同装饰类以及这些装饰类的排列组合，可以实现不同效果
* 符合开闭原则

缺点：
* 会出现更多的代码，更多的类，增加程序复杂性
* 动态装饰时，多层装饰时会更复杂

#### 3.8适配器模式
定义：将一个类的接口转换成客户期望的另一个接口<br/>
使原本接口不兼容的类可以一起工作<br/>

适用场景：
* 已经存在的类，它的方法和需求不匹配时(方法结果相同或相似)
* 不是软件设计阶段考虑的设计模式，是随着软件维护，由于不同产品、不同厂商造成功能类似而接口不相同情况下的解决方案

优点：
* 能提高类的透明性和复用，现有的类复用但不需要改变
* 目标类和适配器类解耦，提高程序扩展性
* 符合开闭原则

缺点：
* 适配器编写过程需要全面考虑，可能会增加系统的复杂性
* 增加系统可读代码难度

扩展：
* 对象适配器
* 类适配器

