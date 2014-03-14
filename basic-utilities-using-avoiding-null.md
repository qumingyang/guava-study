使用和避免null
===
---

null本身不是对象，也不是Objcet的实例

###### 问题:
null代表不确定的对象, 是一个很模糊的概念, 容易产生二义性

比如<br>
Map.get(key)若返回value值为null，其代表的含义可能是该键指向的value值是null，亦或者该键在map中并不存在

###### 好处:
从内存消耗和效率方面，null更加廉价

###### 解决: Optional



---
[返回目录](Readme.md)