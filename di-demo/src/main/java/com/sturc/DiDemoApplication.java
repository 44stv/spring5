package com.sturc;

import com.sturc.controllers.ConstructorInjectedController;
import com.sturc.controllers.GetterInjectedController;
import com.sturc.controllers.MyController;
import com.sturc.controllers.PropertyInjectedController;
import com.sturc.examplebeans.FakeDataSource;
import com.sturc.examplebeans.FakeJmsBroker;
import com.sturc.services.PrimaryGreetingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

//		MyController controller = (MyController) ctx.getBean("myController");

//		System.out.println(ctx.getBean(MyController.class).hello());
//
//		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
//		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
//		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUser());

		FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.getUsername());
	}
}
