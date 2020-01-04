package com.util;

//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MutiThread implements Runnable{
	/**
	 * 多线程高并发异步处理
	 */
	@Override
	public void run() {
		System.err.println("这里处理任务task");
	}
	
	public static void main(String[] args) {
		Thread t=new Thread(new MutiThread());
		Pool p=new Pool();
        p.getInstance().execute(t);
        //ExecutorService fixedThreadPool=Executors.newFixedThreadPool(10);
        //fixedThreadPool.execute(t); 
	}
	
	static class Pool{
		private static ThreadPoolExecutor pool=null;
		private Pool() {}
		public synchronized ThreadPoolExecutor getInstance() {
			if(pool==null) {
				pool=new ThreadPoolExecutor(10,100,2L,TimeUnit.MILLISECONDS,
						new LinkedBlockingQueue<Runnable>(),new ThreadFactory() {
							@Override
							public Thread newThread(Runnable r) {
								Thread t=new Thread(r);
								t.setDaemon(true);
								return t;
							}
				} );
			}
			return pool;
		}
	}
	



//线程池的几个重要参数
//线程池 - ThreadPoolExecutor
//参数
//corePoolSize ：核心线程数量
//maximumPoolSize ：线程最大线程数
//workQueue ：阻塞队列，存储等待执行的任务 很重要 会对线程池运行产生重大影响
//keepAliveTime ：线程没有任务时最多保持多久时间终止
//unit ：keepAliveTime的时间单位
//threadFactory ：线程工厂，用来创建线程
//rejectHandler ：当拒绝处理任务时的策略
	
//方法
//execute（）：提交任务，交给线程池执行
//submit（）：提交任务，能够返回执行结果 execute + Future
//shutdown（）：关闭线程池，等待任务都执行完
//shutdownNow（）：关闭线程池，不等待任务执行完
//getTaskCount（）：线程池已执行和未执行的任务总数
//getCompletedTaskCount（）：已完成的任务数量
//getPoolSize（）：线程池当前的线程数量
//getActiveCount（）：当前线程池中正在执行任务的线程数量
	
//线程池 - Executor框架接口
//Executors.newCachedThreadPool : 可缓存线程池，超过需要会回收多余线程，线程不足会创建新线程
//Executors.newFixedThreadPool ：定长线程池，超出线程等待
//Executors.newScheduledThreadPool ：定长线程池，支持定时，周期性任务执行
//Executors.newSingleThreadExecutor ：单线程线程池，按照指定任务顺序执行
//线程池 - 合理配置
//
//cpu密集型任务，就需要尽量压榨CPU，参考值设为NCPU+1
//
//IO密集型任务，参考值设为2*NCPU
//线程池特点
//
//线程池的使用主要是同用存在线程，减少对象创建消亡，有效线程最大并发数，避免过多资源竞争，避免阻塞，性能较好

}

