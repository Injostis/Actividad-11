<?php

use Illuminate\Support\Facades\Route;

Route::view('/home', 'home')->name('home');
Route::view('/casa', 'casa')->name('casa');
Route::view('/fotos', 'fotos')->name('fotos');
Route::view('/contacto', 'contacto')->name('contacto');


Route::get('/', function () {
    return view('welcome');
});
