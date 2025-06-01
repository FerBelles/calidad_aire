grammar calidad_aire;

file: conjunto END ;

conjunto: datos SEP conjunto # conjuntos
    | datos                  # data ;
datos: pm10 pm25 o3 so2 no2 co;

pm10: 'PM10' ':' INT NEWLINE ;
pm25: 'PM2.5' ':' INT NEWLINE ;
o3: 'O3' ':' INT NEWLINE ;
so2: 'SO2' ':' INT NEWLINE ;
no2: 'NO2' ':' INT NEWLINE ;
co: 'CO' ':' INT NEWLINE ;

SEP: '---' NEWLINE ;
END: '$\r\n' ;
NEWLINE: '\r\n' ;
INT: [0-9]+ ;
WS: [ \t]+ -> skip ;