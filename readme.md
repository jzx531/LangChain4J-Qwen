# LangChain4j + Qwen

使用LangChain4j搭建智能客服

会话数据持久化使用Docker + Redis

启动方式:

```
 docker run -d --name redis-stack -p 6379:6379 redis/redis-stack:latest
```

构建自己的ChatMemoryStore
implements ChatMemoryStore ,之后重写

```java
List<ChatMessage> getMessages(Object memoryId);
void updateMessages(Object memoryId, List<ChatMessage> messages);
void deleteMessages(Object memoryId);
```
