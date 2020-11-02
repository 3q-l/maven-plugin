package com.lsp.mojo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * 第一个mojo
 * @author lishuaipeng
 * @date 2020/11/2 11:20 上午
 */
@Mojo(name = "hello")
public class MyMojo extends AbstractMojo {



    @Override
    public void execute() throws MojoExecutionException {
        getLog().info("==========Hello=============");
    }
}
