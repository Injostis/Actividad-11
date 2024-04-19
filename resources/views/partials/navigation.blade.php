<ul>
  <li><a href="{{ route('home') }}" style="font-size: 24px @if(Request::is('home')) font-size: 40px; @endif" >Home</a></li>
  <li><a href="{{ route('casa') }}" style="font-size: 24px @if(Request::is('casa')) font-size: 40px; @endif" >Casa</a></li>
  <li><a href="{{ route('fotos') }}" style="font-size: 24px @if(Request::is('fotos')) font-size: 40px; @endif">Fotos</a></li>
  <li><a href="{{ route('contacto') }}" style="font-size: 24px @if(Request::is('contacto')) font-size: 40px; @endif">Contacto</a></li>
</ul>