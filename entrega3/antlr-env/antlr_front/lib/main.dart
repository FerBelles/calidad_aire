import 'package:flutter/material.dart';
import 'dart:convert';
import 'dart:async';
import 'package:http/http.dart' as http;

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Calidad de aire',
      theme: ThemeData(
        // This is the theme of your application.
        //
        // TRY THIS: Try running your application with "flutter run". You'll see
        // the application has a purple toolbar. Then, without quitting the app,
        // try changing the seedColor in the colorScheme below to Colors.green
        // and then invoke "hot reload" (save your changes or press the "hot
        // reload" button in a Flutter-supported IDE, or press "r" if you used
        // the command line to start the app).
        //
        // Notice that the counter didn't reset back to zero; the application
        // state is not lost during the reload. To reset the state, use hot
        // restart instead.
        //
        // This works for code too, not just values: Most code changes can be
        // tested with just a hot reload.
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
        useMaterial3: true,
      ),
      home: const MyHomePage(title: 'Calidad de aire'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key, required this.title});

  // This widget is the home page of your application. It is stateful, meaning
  // that it has a State object (defined below) that contains fields that affect
  // how it looks.

  // This class is the configuration for the state. It holds the values (in this
  // case the title) provided by the parent (in this case the App widget) and
  // used by the build method of the State. Fields in a Widget subclass are
  // always marked "final".

  final String title;

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  TextEditingController pm10Controller = TextEditingController(text: '0');
  TextEditingController pm25Controller = TextEditingController(text: '0');
  TextEditingController o3Controller = TextEditingController(text: '0');
  TextEditingController so2Controller = TextEditingController(text: '0');
  TextEditingController no2Controller = TextEditingController(text: '0');
  TextEditingController coController = TextEditingController(text: '0');
  String pm10_text = '0';
  String pm25_text = '0';
  String o3_text = '0';
  String so2_text ='0';
  String no2_text ='0';
  String co_text ='0';
  String statement = '';
  String result = '';
  Color result_color = Colors.black;

 final url = Uri.parse("https://calidad-aire-entrega2.onrender.com/calidad_aire");
 //final url = Uri.parse("http://localhost:8080/calc");

final headers = { "Content-Type": "application/json;charset=UTF-8"};

 void callModel() async {
       print('antlr model...');
       statement = 'PM10: ' + pm10_text + ' \\r\\n ' +
                    'PM2.5: ' + pm25_text + ' \\r\\n ' + 
                    'O3: ' + o3_text + ' \\r\\n ' +
                    'SO2: ' + so2_text + ' \\r\\n ' +
                    'NO2: ' + no2_text + ' \\r\\n ' +
                    'CO: ' + co_text + ' \\r\\n ' +
                    ' \$\\r\\n ';
       print(statement);

       try {
       final prediction_instance = "{ \"statement\": \"" + statement + "\" }";

       //print(jsonEncode(prediction_instance, json_));

     final res = await http.post(url, headers: headers, body: prediction_instance);
     if (res.statusCode == 200) {
        final json_prediction = (res.body);
            setState(() {
      
             result = res.body;
             result = clean_result(result);
            
            });
        print(  json_prediction);

        if(result.contains('buena')){
          result_color = Colors.green;
        }else if(result.contains('aceptable')){
          result_color = Colors.yellow;
        }else if(result.contains('extremadamente mala')){
          result_color = Colors.purple;
        }else if(result.contains('muy mala')){
          result_color = Colors.red;
        }else if(result.contains('mala')){
          result_color = Colors.orange;
        }else{
          result_color = Colors.black;
        }
     }
     else {       print('error');
     }
   } catch (e) { print(e.toString());
   }
}

  String clean_result(String text){
    List<String> body = text.split(":");
    text = body[1];
    text = text.replaceAll("\"", "");
    text = text.replaceAll("}", "");
    text = text.replaceAll("\\r\\n", "");
    return text;
  }

  @override
  Widget build(BuildContext context) {
    // This method is rerun every time setState is called, for instance as done
    // by the _incrementCounter method above.
    //
    // The Flutter framework has been optimized to make rerunning build methods
    // fast, so that you can just rebuild anything that needs updating rather
    // than having to individually change instances of widgets.
    return Scaffold(
      appBar: AppBar(
        // TRY THIS: Try changing the color here to a specific color (to
        // Colors.amber, perhaps?) and trigger a hot reload to see the AppBar
        // change color while the other colors stay the same.
        backgroundColor: Theme.of(context).colorScheme.inversePrimary,
        // Here we take the value from the MyHomePage object that was created by
        // the App.build method, and use it to set our appbar title.
        title: Text(widget.title),
      ),
      body: Center(
        // Center is a layout widget. It takes a single child and positions it
        // in the middle of the parent.
        child: Column(
          // Column is also a layout widget. It takes a list of children and
          // arranges them vertically. By default, it sizes itself to fit its
          // children horizontally, and tries to be as tall as its parent.
          //
          // Column has various properties to control how it sizes itself and
          // how it positions its children. Here we use mainAxisAlignment to
          // center the children vertically; the main axis here is the vertical
          // axis because Columns are vertical (the cross axis would be
          // horizontal).
          //
          // TRY THIS: Invoke "debug painting" (choose the "Toggle Debug Paint"
          // action in the IDE, or press "p" in the console), to see the
          // wireframe for each widget.
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[ /*                  RENGLON ORIGINAL AQUI!!!!!!!!!!!
            TextField(
                  controller: nameController,
                  maxLines: null,
                  decoration: InputDecoration(
                    border: OutlineInputBorder(),
                    labelText: 'Type formula',
                  ),
                  onChanged: (text) {
                    setState(() {
                      statement = text;
                      //you can access nameController in its scope to get
                      // the value of text entered as shown below
                      //fullName = nameController.text;
                    });
                  },
                ), */
            Padding(padding: const EdgeInsets.all(8.0)),

            TextField(
                  controller: pm10Controller,
                  style: TextStyle(fontSize: 25.0),
                  decoration: InputDecoration(
                    border: OutlineInputBorder(),
                    labelText: 'PM10',
                    labelStyle: TextStyle(fontSize: 30.0),
                    
                  ),
                  onChanged: (pm10_state) {
                    setState(() {
                      pm10_text = pm10_state;
                      //you can access nameController in its scope to get
                      // the value of text entered as shown below
                      //fullName = nameController.text;
                    });
                  },
                ),

            Padding(padding: const EdgeInsets.all(8.0)),


            TextField(
                  controller: pm25Controller,
                  style: TextStyle(fontSize: 25.0),
                  decoration: InputDecoration(
                    border: OutlineInputBorder(),
                    labelText: 'PM2.5',
                    labelStyle: TextStyle(fontSize: 30.0)
                  ),
                  onChanged: (pm25_state) {
                    setState(() {
                      pm25_text = pm25_state;
                      //you can access nameController in its scope to get
                      // the value of text entered as shown below
                      //fullName = nameController.text;
                    });
                  },
                ),

            Padding(padding: const EdgeInsets.all(8.0)),


            TextField(
                  controller: o3Controller,
                  style: TextStyle(fontSize: 25.0),
                  decoration: InputDecoration(
                    border: OutlineInputBorder(),
                    labelText: 'O3',
                    labelStyle: TextStyle(fontSize: 30.0)
                  ),
                  onChanged: (o3_state) {
                    setState(() {
                      o3_text = o3_state;
                      //you can access nameController in its scope to get
                      // the value of text entered as shown below
                      //fullName = nameController.text;
                    });
                  },
                ),

            Padding(padding: const EdgeInsets.all(8.0)),


            TextField(
                  controller: so2Controller,
                  style: TextStyle(fontSize: 25.0),
                  decoration: InputDecoration(
                    border: OutlineInputBorder(),
                    labelText: 'SO2',
                    labelStyle: TextStyle(fontSize: 30.0)
                  ),
                  onChanged: (so2_state) {
                    setState(() {
                      so2_text = so2_state;
                      //you can access nameController in its scope to get
                      // the value of text entered as shown below
                      //fullName = nameController.text;
                    });
                  },
                ),

            Padding(padding: const EdgeInsets.all(8.0)),


            TextField(
                  controller: no2Controller,
                  style: TextStyle(fontSize: 25.0),
                  decoration: InputDecoration(
                    border: OutlineInputBorder(),
                    labelText: 'NO2',
                    labelStyle: TextStyle(fontSize: 30.0)
                  ),
                  onChanged: (no2_state) {
                    setState(() {
                      no2_text = no2_state;
                      //you can access nameController in its scope to get
                      // the value of text entered as shown below
                      //fullName = nameController.text;
                    });
                  },
                ),

            Padding(padding: const EdgeInsets.all(8.0)),


            TextField(
                  controller: coController,
                  style: TextStyle(fontSize: 25.0),
                  decoration: InputDecoration(
                    border: OutlineInputBorder(),
                    labelText: 'CO',
                    labelStyle: TextStyle(fontSize: 30.0)
                  ),
                  onChanged: (co_state) {
                    setState(() {
                      co_text = co_state;
                      //you can access nameController in its scope to get
                      // the value of text entered as shown below
                      //fullName = nameController.text;
                    });
                  },
                ),
            /*
            Container(
              margin: EdgeInsets.all(20),
              child: Text("{ statement : '" + statement + "'}"),
            ),
            const Text(
              'Calling api ... ',
            ),
            */

            Padding(padding: const EdgeInsets.all(8.0)),

            Container(
              decoration: BoxDecoration(
                border: Border.all(
                  color: result_color,
                  width: 2.0,
                ),
                borderRadius: BorderRadius.circular(10),
              ),
              width: double.infinity,
              child: Text(
                '$result',
                style: Theme.of(context).textTheme.headlineMedium,
              ),
            )
            /*
            Text(
              '$result',
              style: Theme.of(context).textTheme.headlineMedium,
            ),
 */
          ],
        ),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: callModel,
        tooltip: 'Enviar',
        child: const Text('Enviar'),
      ), // This trailing comma makes auto-formatting nicer for build methods.
    );
  }
}