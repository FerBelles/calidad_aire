package com.ferbelles.calidad_aire;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
public class HelloController {
    @PostMapping("/calidad_aire")
    @ResponseBody
    public Result calc(@RequestBody Statement myStatements) {
        
        calidad_aireLexer lexer = new calidad_aireLexer(CharStreams.fromString(myStatements.getStatement()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
         calidad_aireParser parser = new calidad_aireParser(tokens);
         ParseTree tree = parser.file(); // parse
         ParseTreeWalker walker = new ParseTreeWalker();
         Listener listener = new Listener();
         walker.walk(listener, tree);
         System.out.println(listener.getResult());
         Result myResult = new Result();
         myResult.setResult(listener.getResult());
         return (myResult);
    }
}
