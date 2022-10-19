package com.Proxy;

public class NetworkTest {
    public static void main(String[] args) {
        Server ser = new Server();
        ProxyServer pro = new ProxyServer(ser);
        pro.browse();
    }

}


interface Network{
    public void browse();
}

// 被代理类
class Server implements Network{

    public void browse(){
        System.out.println("真实的服务器访问网络");
    }
}

// 代理类
class ProxyServer implements Network{

    private Network work;

    public ProxyServer(Network work){
        this.work = work;
    }

    public void check(){
        System.out.println("联网之前的检查工作");
    }
    public void browse(){
        check();
        work.browse();

    }
}