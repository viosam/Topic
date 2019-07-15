1.自定义Exception类并实现Runnable(这个类的作用是为了在handler声明处理异常的类型)
2.自定义Handler类（添加@ControllerAdvice注解）
3.在自定义异常处理类的方法声明处理的异常类型（如： @ExceptionHandler(value = MyException.class)）